package br.com.stf.util;

import java.util.ArrayList;
import java.util.List;

public enum Parameters {

	FUNDOS_RJ("Stefanini_Fundos", "235478", "RJ", "3", "1", "3", false),
	SOCIAL_RJ("Stefanini_Social", "457856", "RJ", "3", "2", "5", false),
	CAPTAR_RJ("Stefanini_Captar", "457854", "RJ", "3", "3", "11", true),
	FUNDOS_SP("Stefanini_Fundos", "235478", "SP", "3", "1", "3", false),
	SOCIAL_SP("Stefanini_Social", "457856", "SP", "3", "2", "5", false),
	CAPTAR_SP("Stefanini_Captar", "457854", "SP", "3", "3", "11", true),
	CAPTAR_BR("Stefanini_Captar", "457854", "BR", "3", "3", "11", true),
	HABITACAO_BR("STEFANINI_HABITACAO", "457854", "BR", "53", "12", "369", true),
	CANAIS_SP("Stefanini_Canais", "715426", "SP", "66", "13", "469", true);
	
	private String login;
	private String pass;
	private String site;
	private String provider;
	private String systemType;
	private String contract;
	private Boolean isConsumer;
	
	Parameters(String login, String pass, String site, String provider, String systemType, String contract,
			Boolean isConsumer) {
		this.login = login;
		this.pass = pass;
		this.site = site;
		this.provider = provider;
		this.systemType = systemType;
		this.contract = contract;
		this.isConsumer = isConsumer;
	}
	
	public static List<Parameters> getParametersConsumer(Boolean consumer){
		List<Parameters> list = new ArrayList<Parameters>();
		
		for (Parameters parameters : Parameters.values()) {
			if(parameters.getIsConsumer().equals(consumer)) {
				list.add(parameters);
			}
		}
		return list;
	}
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}
	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}
	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}
	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}
	/**
	 * @return the systemType
	 */
	public String getSystemType() {
		return systemType;
	}
	/**
	 * @param systemType the systemType to set
	 */
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	/**
	 * @return the contract
	 */
	public String getContract() {
		return contract;
	}
	/**
	 * @param contract the contract to set
	 */
	public void setContract(String contract) {
		this.contract = contract;
	}
	/**
	 * @return the isConsumer
	 */
	public Boolean getIsConsumer() {
		return isConsumer;
	}
	/**
	 * @param isConsumer the isConsumer to set
	 */
	public void setIsConsumer(Boolean isConsumer) {
		this.isConsumer = isConsumer;
	}
	
	
	
}
