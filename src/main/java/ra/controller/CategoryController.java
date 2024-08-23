package ra.controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.model.dto.DateResponse;

import ra.model.service.ICategoryService;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @GetMapping
    public ResponseEntity<DateResponse> getAllCategories() {
        return new ResponseEntity<>
                (new DateResponse(categoryService.findAll(), HttpStatus.OK),HttpStatus.OK);
    }



}
