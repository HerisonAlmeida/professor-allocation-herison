package controller;


import com.project.professor.allocation.service.DepartmentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private final DepartmentService departmenteService;

    public DepartmentController(DepartmentService departmenteService) {
        this.departmenteService = departmenteService;
    }
}
