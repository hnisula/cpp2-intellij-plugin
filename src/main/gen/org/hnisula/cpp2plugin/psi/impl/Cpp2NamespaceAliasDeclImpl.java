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

public class Cpp2NamespaceAliasDeclImpl extends ASTWrapperPsiElement implements Cpp2NamespaceAliasDecl {

  public Cpp2NamespaceAliasDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitNamespaceAliasDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public Cpp2QIdentifier getQIdentifier() {
    return findNotNullChildByClass(Cpp2QIdentifier.class);
  }

  @Override
  @Nullable
  public PsiElement getContext() {
    return Cpp2PsiUtil.getContext(this);
  }

}
