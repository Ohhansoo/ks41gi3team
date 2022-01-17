package k3.damageError.ahs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import k3.damageError.ahs.dto.K3DamageError;
import k3.damageError.ahs.service.K3DamageErrorService;

@Controller
@RequestMapping(value="/team03/goodsManagement/damageError")
public class K3DamageErrorController {
	/**
	 * 의존성 주입 생성자 메소드
	 */
	private K3DamageErrorService k3DamageErrorService;
	public K3DamageErrorController(K3DamageErrorService k3DamageErrorService) {
		this.k3DamageErrorService = k3DamageErrorService;
	}
	
	/**
	 * AS대기현황
	 */
	@GetMapping("/k3DamageErrorList")
	public String k3DamageErrorList(K3DamageError k3DamageErrorIn,K3DamageError k3DamageErrorOut,  Model model) {
		List<K3DamageError> k3DamageErrorListIn = k3DamageErrorService.k3DamageErrorListIn(k3DamageErrorIn);
		List<K3DamageError> k3DamageErrorListOut = k3DamageErrorService.k3DamageErrorListOut(k3DamageErrorOut);
		
		System.out.println("controller---------->>>"+k3DamageErrorListIn);
		model.addAttribute("title","AS");
		model.addAttribute("k3DamageErrorListIn",k3DamageErrorListIn);
		model.addAttribute("k3DamageErrorListOut",k3DamageErrorListOut);
		return "/team03/goodsManagement/damageError/k3DamageErrorList";
	}
}
