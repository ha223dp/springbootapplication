package com.dailyhosseinwork.dreamshops.service.image;

import com.dailyhosseinwork.dreamshops.model.Image;
import com.dailyhosseinwork.dreamshops.model.Product;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Image image);
    Image saveImage(MultipartFile file, Long productId);
    void updateImage(MultipartFile file, Long imageId);

}
