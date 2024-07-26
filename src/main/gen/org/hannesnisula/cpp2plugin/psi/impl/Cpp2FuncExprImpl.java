// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.hannesnisula.cpp2plugin.psi.Cpp2Types.*;
import org.hannesnisula.cpp2plugin.psi.*;

public class Cpp2FuncExprImpl extends Cpp2ExprImpl implements Cpp2FuncExpr {

  public Cpp2FuncExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitFuncExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public Cpp2FuncSignature getFuncSignature() {
    return findNotNullChildByClass(Cpp2FuncSignature.class);
  }

  @Override
  @Nullable
  public Cpp2Stmt getStmt() {
    return findChildByClass(Cpp2Stmt.class);
  }

  @Override
  @Nullable
  public Cpp2StmtBlock getStmtBlock() {
    return findChildByClass(Cpp2StmtBlock.class);
  }

}
