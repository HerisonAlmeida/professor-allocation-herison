package controller;


import com.project.professor.allocation.service.AllocationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllocationController {

    private AllocationController allocationService;

    public AllocationController(AllocationController allocationService) {
        this.allocationService = allocationService;
    }


}
