package br.org.asabrasil.sped.modelos.bloco0;

import br.org.asabrasil.sped.modelos.RegistroFechaBloco;
import br.org.asabrasil.sped.util.ConstantesSistema;

public class Registro0990 extends RegistroFechaBloco {

		

	public Registro0990() {
		super();
		preencheCamposDefault();
	}


	@Override
	public void preencheCamposDefault() {
		// preenche a identificacao do registro
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_0990);

	}

	@Override
	public void geraLayout(StringBuilder conteudo) {
		// Cria a linha referente ao bloco
		conteudo.append(this.getIdentRegistro());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		conteudo.append(this.getQtdLinhas());
		conteudo.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		// gera o trecho que indica fim do registro		
		conteudo.append(this.geraFinalRegistro());

	}

}
