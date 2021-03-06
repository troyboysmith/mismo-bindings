package com.sysdelphia.bindings.mismo.title;

import java.util.ArrayList;


public class ProductName {
  protected String _ID;

  protected String _Identifier;

  protected String _Description;


  public void add_ADDON(ProductNameAddOn _ADDON) {
    _ADDONList.add(_ADDON);
  }

  public ProductNameAddOn get_ADDON(int index) {
    return (ProductNameAddOn)_ADDONList.get( index );
  }

  public int size_ADDONList() {
    return _ADDONList.size();
  }

  public String get_ID() {
    return this._ID;
  }

  public void set_ID(String _ID) {
    this._ID = _ID;
  }

  public String get_Identifier() {
    return this._Identifier;
  }

  public void set_Identifier(String _Identifier) {
    this._Identifier = _Identifier;
  }

  public String get_Description() {
    return this._Description;
  }

  public void set_Description(String _Description) {
    this._Description = _Description;
  }

  protected ArrayList _ADDONList = new ArrayList();

}
