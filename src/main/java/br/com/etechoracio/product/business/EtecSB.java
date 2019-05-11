package br.com.etechoracio.product.business;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.common.business.BaseSB;
import br.com.etechoracio.product.dao.EtecDAO;
import br.com.etechoracio.product.model.ETEC;


@Service
public class EtecSB extends BaseSB {

	private EtecDAO etecDAO;

	@Override
	protected void postConstructImpl() {
		EtecDAO= getDAO(EtecDAO.class);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(ETEC etec) {
		etecDAO.save(etec);
	}

}
