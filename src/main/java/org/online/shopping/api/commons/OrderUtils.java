package org.online.shopping.api.commons;

import java.util.ArrayList;
import java.util.List;

import org.online.shopping.api.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component
public class OrderUtils {

	public List<Product> mapDtoToModel(OrderRequest request) {
		List<Product> products = new ArrayList<>();
		return products;
	}
	
	/*private String handleUploadFilePath(MultipartFile file){
		String dest="D:/IMAGE_PATH/";
		
	}*/
}
