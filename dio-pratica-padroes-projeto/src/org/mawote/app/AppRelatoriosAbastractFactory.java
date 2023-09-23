package org.mawote.app;

import org.mawote.orgaos.OrgaoA;
import org.mawote.orgaos.OrgaoB;
import org.mawote.relatorios.RelatorioSemanal;

public class AppRelatoriosAbastractFactory {

	public static void main(String[] args) {
		
		OrgaoA orgaoA = new OrgaoA();
		orgaoA.produzirRelatorioSemanal();
		
		OrgaoB orgaoB = new OrgaoB();
		orgaoB.produzirRelatorioAnual();
		
	}

}
