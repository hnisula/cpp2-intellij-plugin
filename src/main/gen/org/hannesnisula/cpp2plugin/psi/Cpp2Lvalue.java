// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface Cpp2Lvalue extends Cpp2Expr {

  @NotNull
  List<Cpp2Expr> getExprList();

  @Nullable
  Cpp2Scope getScope();

  @Nullable
  String getIdentifierString();

  @NotNull
  PsiReference[] getReferences();

}
