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

public class Cpp2StmtImpl extends ASTWrapperPsiElement implements Cpp2Stmt {

  public Cpp2StmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2Assign getAssign() {
    return findChildByClass(Cpp2Assign.class);
  }

  @Override
  @Nullable
  public Cpp2NamedDecl getNamedDecl() {
    return findChildByClass(Cpp2NamedDecl.class);
  }

  @Override
  @Nullable
  public Cpp2ReturnExpr getReturnExpr() {
    return findChildByClass(Cpp2ReturnExpr.class);
  }

}
