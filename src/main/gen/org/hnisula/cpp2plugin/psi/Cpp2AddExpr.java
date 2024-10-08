// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2AddExpr extends Cpp2Expr {

  @NotNull
  List<Cpp2Expr> getExprList();

  @Nullable
  PsiElement getContext();

}
