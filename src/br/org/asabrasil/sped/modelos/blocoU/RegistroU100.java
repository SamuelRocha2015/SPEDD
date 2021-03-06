package br.org.asabrasil.sped.modelos.blocoU;

import java.util.List;

import br.org.asabrasil.sped.modelos.Linha;
import br.org.asabrasil.sped.util.ConstantesSistema;
import br.org.asabrasil.sped.util.Util;

public class RegistroU100 extends Linha {

	private String codContaReferencial;
	private String descricaoContaReferencial;
	private String identTpConta;
	private String nivelConta;
	private String natConta;
	private String codContaSintetica;
	private String saldoIniContaReferenciada;
	private String indicSituacaoSaldoIni;
	private String saldoFinContaReferenciada;
	private String indicSituacaoSaldoFin;

	public String getCodContaReferencial() {
		return Util.validaAtributoString(codContaReferencial);
	}

	public String getDescricaoContaReferencial() {
		return Util.validaAtributoString(descricaoContaReferencial);
	}

	public String getIdentTpConta() {
		return Util.validaAtributoString(identTpConta);
	}

	public String getNivelConta() {
		return Util.validaAtributoString(nivelConta);
	}

	public String getNatConta() {
		return Util.validaAtributoString(natConta);
	}

	public String getCodContaSintetica() {
		return Util.validaAtributoString(codContaSintetica);
	}

	public String getSaldoIniContaReferenciada() {
		return Util.validaAtributoString(saldoIniContaReferenciada);
	}

	public String getIndicSituacaoSaldoIni() {
		return Util.validaAtributoString(indicSituacaoSaldoIni);
	}

	public String getSaldoFinContaReferenciada() {
		return Util.validaAtributoString(saldoFinContaReferenciada);
	}

	public String getIndicSituacaoSaldoFin() {
		return Util.validaAtributoString(indicSituacaoSaldoFin);
	}

	public void setCodContaReferencial(String codContaReferencial) {
		this.codContaReferencial = codContaReferencial;
	}

	public void setDescricaoContaReferencial(String descricaoContaReferencial) {
		this.descricaoContaReferencial = descricaoContaReferencial;
	}

	public void setIdentTpConta(String identTpConta) {
		this.identTpConta = identTpConta;
	}

	public void setNivelConta(String nivelConta) {
		this.nivelConta = nivelConta;
	}

	public void setNatConta(String natConta) {
		this.natConta = natConta;
	}

	public void setCodContaSintetica(String codContaSintetica) {
		this.codContaSintetica = codContaSintetica;
	}

	public void setSaldoIniContaReferenciada(String saldoIniContaReferenciada) {
		this.saldoIniContaReferenciada = saldoIniContaReferenciada;
	}

	public void setIndicSituacaoSaldoIni(String indicSituacaoSaldoIni) {
		this.indicSituacaoSaldoIni = indicSituacaoSaldoIni;
	}

	public void setSaldoFinContaReferenciada(String saldoFinContaReferenciada) {
		this.saldoFinContaReferenciada = saldoFinContaReferenciada;
	}

	public void setIndicSituacaoSaldoFin(String indicSituacaoSaldoFin) {
		this.indicSituacaoSaldoFin = indicSituacaoSaldoFin;
	}

	public RegistroU100() {
		super();
		preencheCamposDefault();
	}

	@Override
	public void preencheCamposDefault() {
		this.setIdentRegistro(ConstantesSistema.REG_REGISTRO_U100);
	}

	@Override
	public void gerarRegistro(List<StringBuilder> listaRegistros) {
		StringBuilder reg = new StringBuilder();
		
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIdentRegistro());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getCodContaReferencial());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getDescricaoContaReferencial());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getIdentTpConta());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getNivelConta());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getNatConta());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getCodContaSintetica());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getSaldoIniContaReferenciada());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getIndicSituacaoSaldoIni());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.getSaldoFinContaReferenciada());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);

		reg.append(this.getIndicSituacaoSaldoFin());
		reg.append(ConstantesSistema.CARACTERE_SEPARADOR);
		
		reg.append(this.geraFinalRegistro());
		
		listaRegistros.add(reg);

	}

}
