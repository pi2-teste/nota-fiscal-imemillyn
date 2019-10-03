/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author lucas
 */
public class NotaFiscalController {
    public static boolean salvar (int numNota, double valNota) {
    NotaFiscal nota = new NotaFiscal();
    
        System.out.println("Agora estou no Controller");
        System.out.println(numNota);
        System.out.println(valNota);
        
        nota.setNumNota(numNota);
        nota.setValNota(valNota);
        
        NotaFiscalDAO dao = new NotaFiscalDAO();
        dao.addNota(nota);
        return true;
        
    
}
}

