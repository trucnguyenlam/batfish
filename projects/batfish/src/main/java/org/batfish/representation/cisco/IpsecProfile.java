package org.batfish.representation.cisco;

import org.batfish.common.util.DefinedStructure;
import org.batfish.datamodel.DiffieHellmanGroup;

public class IpsecProfile extends DefinedStructure<String> {

  private static final long serialVersionUID = 1L;

  private DiffieHellmanGroup _pfsGroup;

  private String _transformSet;

  public IpsecProfile(String name, int definitionLine) {
    super(name, definitionLine);
  }

  public DiffieHellmanGroup getPfsGroup() {
    return _pfsGroup;
  }

  public String getTransformSet() {
    return _transformSet;
  }

  public void setPfsGroup(DiffieHellmanGroup pfsGroup) {
    _pfsGroup = pfsGroup;
  }

  public void setTransformSet(String transformSet) {
    _transformSet = transformSet;
  }
}
