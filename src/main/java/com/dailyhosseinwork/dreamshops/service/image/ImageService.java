package com.dailyhosseinwork.dreamshops.service.image;

import com.dailyhosseinwork.dreamshops.model.Image;
import com.dailyhosseinwork.dreamshops.repository.ImageRepository;
import com.dailyhosseinwork.dreamshops.service.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ImageService implements IImageService{
    private final ImageRepository imageRepository;
    private final IProductService productService;


    @Override
    public Image getImageById(Long id) {
        return null;
    }

    @Override
    public void deleteImageById(Image image) {

    }

    @Override
    public Image saveImage(MultipartFile file, Long productId) {
        return null;
    }

    @Override
    public void updateImage(MultipartFile file, Long imageId) {

    }
}
