// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2MemberAccessExpr extends Cpp2Expr {

  @NotNull
  List<Cpp2Expr> getExprList();

  @Nullable
  Cpp2Identifier getIdentifier();

  @Nullable
  PsiElement getContext();

}
