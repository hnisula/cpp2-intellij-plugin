// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.hnisula.cpp2plugin.psi.Cpp2Types.*;
import org.hnisula.cpp2plugin.psi.Cpp2PsiStatementBlock;
import org.hnisula.cpp2plugin.psi.*;

public class Cpp2StmtBlockImpl extends Cpp2PsiStatementBlock implements Cpp2StmtBlock {

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
  public List<Cpp2DoWhileLoop> getDoWhileLoopList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2DoWhileLoop.class);
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
  public List<Cpp2FuncAliasDecl> getFuncAliasDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2FuncAliasDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2FuncDecl> getFuncDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2FuncDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2IfBranch> getIfBranchList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2IfBranch.class);
  }

  @Override
  @NotNull
  public List<Cpp2NamespaceAliasDecl> getNamespaceAliasDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2NamespaceAliasDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2ObjAliasDecl> getObjAliasDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2ObjAliasDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2TypeAliasDecl> getTypeAliasDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2TypeAliasDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2UsingNamespace> getUsingNamespaceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2UsingNamespace.class);
  }

  @Override
  @NotNull
  public List<Cpp2ValueDecl> getValueDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2ValueDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2WhileLoop> getWhileLoopList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2WhileLoop.class);
  }

  @Override
  @Nullable
  public PsiElement getContext() {
    return Cpp2PsiUtil.getContext(this);
  }

}
