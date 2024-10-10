// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.hnisula.cpp2plugin.Cpp2NamedDeclaration;
import org.hnisula.cpp2plugin.Cpp2Scope;

public interface Cpp2FuncDecl extends Cpp2NamedDeclaration, Cpp2Scope {

  @Nullable
  Cpp2Expr getExpr();

  @NotNull
  Cpp2ParamList getParamList();

  @Nullable
  Cpp2ReturnType getReturnType();

  @Nullable
  Cpp2StmtBlock getStmtBlock();

  @Nullable
  Cpp2TemplateDecl getTemplateDecl();

  @Nullable
  PsiElement getContext();

}
