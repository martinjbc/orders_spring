package org.orders.service;

import java.util.List;

import org.orders.base.GenericServiceImpl;
import org.orders.dao.CategoriasDao;
import org.orders.entity.Categorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriasServiceImpl extends GenericServiceImpl<Categorias, Integer>
implements CategoriasService {
	@Autowired
	private CategoriasDao categoriasDao;
    public CategoriasServiceImpl(){
    }
	@Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<Categorias> listaPersonalizada() {
        return categoriasDao.listaPersonalizada();
    }
}
