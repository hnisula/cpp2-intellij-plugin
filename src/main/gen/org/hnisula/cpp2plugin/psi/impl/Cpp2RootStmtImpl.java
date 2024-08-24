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

public class Cpp2RootStmtImpl extends ASTWrapperPsiElement implements Cpp2RootStmt {

  public Cpp2RootStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitRootStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2FuncDecl getFuncDecl() {
    return findChildByClass(Cpp2FuncDecl.class);
  }

  @Override
  @Nullable
  public Cpp2NamespaceDecl getNamespaceDecl() {
    return findChildByClass(Cpp2NamespaceDecl.class);
  }

  @Override
  @Nullable
  public Cpp2TypeDecl getTypeDecl() {
    return findChildByClass(Cpp2TypeDecl.class);
  }

  @Override
  @Nullable
  public Cpp2ValueDecl getValueDecl() {
    return findChildByClass(Cpp2ValueDecl.class);
  }

}
