package cc.whitespace123.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cc.whitespace123.enity.Image;
import cc.whitespace123.mapper.ImageMapper;
import cc.whitespace123.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {
	@Autowired
	@Qualifier(value = "imageMapper")
	private ImageMapper imageMapper;

	@Override
	public void saveImage(Image image) {
		imageMapper.insertImage(image);
	}

	@Override
	public void removeImage(Image image) {
		imageMapper.deleteImage(image);
	}

	@Override
	public void modifyImage(Image image) {
		imageMapper.updateImage(image);
	}

	@Override
	public Image findImage(Image image) {
		Image target = imageMapper.selectImage(image);
		return target;
	}

	@Override
	public List<Image> findImagees(Image image) {
		List<Image> images = imageMapper.selectImages(image);
		return images;
	}

}
