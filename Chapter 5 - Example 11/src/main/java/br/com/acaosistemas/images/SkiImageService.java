package br.com.acaosistemas.images;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SkiImageService {
	private String folder = "images";
	private Map<String, String> photos;

	@WebMethod
	public Image getImage(String name) {
		System.out.println(name);
		return createImage(name);
	}

	@WebMethod
	public List<Image> getImages() {
		return createImageList();
	}

	public SkiImageService() {
		photos = new HashMap<String, String>();
		photos.put("nordic", "nordic.jpg");
		photos.put("alpine", "alpine.jpg");
		photos.put("telemk", "telemk.jpg");
	}

	@SuppressWarnings("rawtypes")
	private Image createImage(String name) {
		String fileName = folder + File.separator + photos.get(name);
		byte[] bytes = getRawBytes(fileName);
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		Iterator iterators = ImageIO.getImageReadersByFormatName("jpeg");
		ImageReader iterator = (ImageReader) iterators.next();
		Image image = null;
		try {
			ImageInputStream iis = ImageIO.createImageInputStream(in);
			iterator.setInput(iis, true);
			image = iterator.read(0);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return image;
	}

	private List<Image> createImageList() {
		List<Image> list = new ArrayList<Image>();
		for (String key : photos.keySet()) {
			Image image = createImage(key);
			if (image != null)
				list.add(image);
		}
		return list;
	}

	private byte[] getRawBytes(String fileName) {
		if (fileName == null)
			fileName = "nordic.jpg";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			FileInputStream in = new FileInputStream(fileName);

			/*if (in == null)
				in = new FileInputStream("nordic.jpg");*/
			byte[] buffer = new byte[2048];
			int n = 0;
			while ((n = in.read(buffer)) != -1)
				out.write(buffer, 0, n); // append to array
			in.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return out.toByteArray();
	}
}