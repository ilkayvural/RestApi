package tr.edu.medipol.yova.OgrenciWebServisi;

import java.util.*;

import org.springframework.web.bind.annotation.*;

//http://localhost:8080/ogrenci/listele
	
@RestController
@RequestMapping("/ogrenci")

public class OgrenciRestApi {

	private static final List<String> OGRENCILER = new ArrayList<>();
	{
       
		 OGRENCILER.add("Jane");
	        OGRENCILER.add("Joe");		
	}
	
	public List<String> Listele() {
		return OGRENCILER;

  }
}