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

public class Cpp2RootStmtsImpl extends Cpp2PsiStatementBlock implements Cpp2RootStmts {

  public Cpp2RootStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitRootStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Cpp2FuncDecl> getFuncDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2FuncDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2NamespaceDecl> getNamespaceDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2NamespaceDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2TypeDecl> getTypeDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2TypeDecl.class);
  }

  @Override
  @NotNull
  public List<Cpp2ValueDecl> getValueDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2ValueDecl.class);
  }

  @Override
  @Nullable
  public PsiElement getContext() {
    return Cpp2PsiUtil.getContext(this);
  }

}
