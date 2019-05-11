package br.com.etechoracio.product.view;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.common.view.BaseMB;
import br.com.etechoracio.product.business.EtecSB;
import br.com.etechoracio.product.model.ETEC;
import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
@Controller
@Scope("view")
public class EtecMB extends BaseMB {

	@Autowired
	private EtecSB etecSB;

	private ETEC edit = new ETEC();

	public void onSave() {
		edit.getEndereco().setETEC(edit);
		etecSB.save(edit);
		showInsertMessage();
	}
}