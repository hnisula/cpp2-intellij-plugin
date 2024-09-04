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

public class Cpp2QIdentifierImpl extends Cpp2ExprImpl implements Cpp2QIdentifier {

  public Cpp2QIdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitQIdentifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<Cpp2Identifier> getIdentifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2Identifier.class);
  }

  @Override
  @NotNull
  public List<Cpp2Template> getTemplateList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, Cpp2Template.class);
  }

  @Override
  @Nullable
  public PsiElement getContext() {
    return Cpp2PsiUtil.getContext(this);
  }

}
