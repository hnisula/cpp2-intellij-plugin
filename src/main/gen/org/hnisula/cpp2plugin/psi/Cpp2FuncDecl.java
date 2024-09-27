// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2FuncDecl extends PsiElement {

  @Nullable
  Cpp2Expr getExpr();

  @NotNull
  Cpp2Identifier getIdentifier();

  @NotNull
  Cpp2ParamList getParamList();

  @Nullable
  Cpp2ReturnType getReturnType();

  @Nullable
  Cpp2StmtBlock getStmtBlock();

  @Nullable
  Cpp2TemplateDecl getTemplateDecl();

  //WARNING: getContext(...) is skipped
  //matching getContext(Cpp2FuncDecl, ...)
  //methods are not found in Cpp2PsiUtil

}
