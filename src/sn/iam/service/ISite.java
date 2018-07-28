package sn.iam.service;

import java.util.List;

import sn.iam.model.Site;

public interface ISite {

	public void addSite(Site site);
	public Site findSiteByName();
	public List<Site> findAll();
}
