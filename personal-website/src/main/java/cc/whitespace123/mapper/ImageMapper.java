package cc.whitespace123.mapper;

import java.util.List;

import cc.whitespace123.enity.Image;

public interface ImageMapper {
	void insertImage(Image image);

	void deleteImage(Image image);

	void updateImage(Image image);

	Image selectImage(Image image);

	List<Image> selectImages(Image image);
}
