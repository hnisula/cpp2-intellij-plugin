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

public class Cpp2ForLoopImpl extends ASTWrapperPsiElement implements Cpp2ForLoop {

  public Cpp2ForLoopImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitForLoop(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Cpp2Expr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2Expr.class);
  }

  @Override
  @Nullable
  public Cpp2ParamList getParamList() {
    return findChildByClass(Cpp2ParamList.class);
  }

  @Override
  @Nullable
  public Cpp2StmtBlock getStmtBlock() {
    return findChildByClass(Cpp2StmtBlock.class);
  }

}
