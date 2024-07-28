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

public class Cpp2FuncCallImpl extends Cpp2ExprImpl implements Cpp2FuncCall {

  public Cpp2FuncCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitFuncCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Cpp2Arg> getArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2Arg.class);
  }

  @Override
  @Nullable
  public Cpp2Scope getScope() {
    return findChildByClass(Cpp2Scope.class);
  }

  @Override
  @Nullable
  public Cpp2Template getTemplate() {
    return findChildByClass(Cpp2Template.class);
  }

}
