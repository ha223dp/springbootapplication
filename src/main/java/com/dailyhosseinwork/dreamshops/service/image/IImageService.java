package com.dailyhosseinwork.dreamshops.service.image;

import com.dailyhosseinwork.dreamshops.dto.ImageDto;
import com.dailyhosseinwork.dreamshops.model.Image;
import com.dailyhosseinwork.dreamshops.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto>saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);

}
