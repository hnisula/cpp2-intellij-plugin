// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.hannesnisula.cpp2plugin.psi.Cpp2Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.hannesnisula.cpp2plugin.psi.*;

public class Cpp2StmtBlockImpl extends ASTWrapperPsiElement implements Cpp2StmtBlock {

  public Cpp2StmtBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitStmtBlock(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Cpp2Assign> getAssignList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2Assign.class);
  }

  @Override
  @NotNull
  public List<Cpp2Decl> getDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2Decl.class);
  }

  @Override
  @NotNull
  public List<Cpp2Expr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2Expr.class);
  }

  @Override
  @NotNull
  public List<Cpp2ForLoop> getForLoopList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2ForLoop.class);
  }

  @Override
  @NotNull
  public List<Cpp2FuncDecl> getFuncDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2FuncDecl.class);
  }

}
