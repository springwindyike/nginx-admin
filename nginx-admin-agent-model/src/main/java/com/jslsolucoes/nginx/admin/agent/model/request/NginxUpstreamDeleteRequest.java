package com.jslsolucoes.nginx.admin.agent.model.request;

public class NginxUpstreamDeleteRequest {

	private String home;
	private String uuid;
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}