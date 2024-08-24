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
import com.intellij.model.psi.PsiSymbolReference;
import java.util.Collection;

public class Cpp2IdentifierImpl extends Cpp2ExprImpl implements Cpp2Identifier {

  public Cpp2IdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitIdentifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2Scope getScope() {
    return findChildByClass(Cpp2Scope.class);
  }

  @Override
  @NotNull
  public Collection<PsiSymbolReference> getOwnReferences() {
    return Cpp2PsiUtil.getOwnReferences(this);
  }

}
