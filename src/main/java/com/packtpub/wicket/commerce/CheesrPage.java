package com.packtpub.wicket.commerce;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;

public abstract class CheesrPage extends WebPage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CheesrPage(){		
	}
	
  public CheesrSession getCheesrSession() {
    return (CheesrSession) getSession();
  }

  public Cart getCart() {
    return getCheesrSession().getCart();
  }

  public List<Cheese> getCheeses() {
    return CheesrApplication.get().getCheeses();
  }
}
