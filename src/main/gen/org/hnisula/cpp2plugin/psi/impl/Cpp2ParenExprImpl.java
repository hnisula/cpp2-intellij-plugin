// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.hnisula.cpp2plugin.psi.Cpp2Types.*;
import org.hnisula.cpp2plugin.psi.*;

public class Cpp2ParenExprImpl extends Cpp2ExprImpl implements Cpp2ParenExpr {

  public Cpp2ParenExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitParenExpr(this);
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

}
