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

public class Cpp2ParamListImpl extends ASTWrapperPsiElement implements Cpp2ParamList {

  public Cpp2ParamListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitParamList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Cpp2Param> getParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2Param.class);
  }

  @Override
  @Nullable
  public Cpp2ThisParam getThisParam() {
    return findChildByClass(Cpp2ThisParam.class);
  }

}
