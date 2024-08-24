// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.hnisula.cpp2plugin.psi.Cpp2Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.hnisula.cpp2plugin.psi.*;

public class Cpp2FuncDeclImpl extends ASTWrapperPsiElement implements Cpp2FuncDecl {

  public Cpp2FuncDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitFuncDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2Expr getExpr() {
    return findChildByClass(Cpp2Expr.class);
  }

  @Override
  @NotNull
  public Cpp2ParamList getParamList() {
    return findNotNullChildByClass(Cpp2ParamList.class);
  }

  @Override
  @Nullable
  public Cpp2ReturnType getReturnType() {
    return findChildByClass(Cpp2ReturnType.class);
  }

  @Override
  @Nullable
  public Cpp2StmtBlock getStmtBlock() {
    return findChildByClass(Cpp2StmtBlock.class);
  }

  @Override
  @Nullable
  public Cpp2TemplateDecl getTemplateDecl() {
    return findChildByClass(Cpp2TemplateDecl.class);
  }

}
