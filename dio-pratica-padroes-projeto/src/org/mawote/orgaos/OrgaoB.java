package org.mawote.orgaos;

import org.mawote.instituicao.InstituicaoFactory;

public class OrgaoB implements InstituicaoFactory{

	@Override
	public void produzirRelatorioSemanal() {
		System.out.println("Produzindo relatorio....");
	}

	@Override
	public void produzirRelatorioMensal() {
		System.out.println("Produzindo relatorio....");
	}

	@Override
	public void produzirRelatorioAnual() {
		System.out.println("Produzindo relatorio....");
	}
	
}
