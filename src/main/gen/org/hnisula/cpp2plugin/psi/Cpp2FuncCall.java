// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2FuncCall extends Cpp2Expr {

  @NotNull
  List<Cpp2Arg> getArgList();

  @NotNull
  Cpp2QIdentifier getQIdentifier();

  //WARNING: getContext(...) is skipped
  //matching getContext(Cpp2FuncCall, ...)
  //methods are not found in Cpp2PsiUtil

}
