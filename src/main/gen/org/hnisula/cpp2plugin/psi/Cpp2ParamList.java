// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2ParamList extends PsiElement {

  @NotNull
  List<Cpp2Param> getParamList();

  @Nullable
  Cpp2ThisParam getThisParam();

  //WARNING: getContext(...) is skipped
  //matching getContext(Cpp2ParamList, ...)
  //methods are not found in Cpp2PsiUtil

}
