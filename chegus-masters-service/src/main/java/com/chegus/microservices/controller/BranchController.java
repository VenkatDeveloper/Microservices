package com.chegus.microservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chegus.microservices.domain.BranchDo;

@RestController
public class BranchController {

	@GetMapping("getBranches")
	public List<BranchDo> getBraches() {
		List<BranchDo> branchDos = new ArrayList<>();
		branchDos.add(new BranchDo("GNT", "Test", "Guntur"));
		branchDos.add(new BranchDo("BLG", "Test1", "Bangalore"));
		branchDos.add(new BranchDo("HYD", "Test2", "Hyderabad"));
		return branchDos;
	}
}
