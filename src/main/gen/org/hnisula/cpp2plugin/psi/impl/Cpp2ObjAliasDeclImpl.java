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

public class Cpp2ObjAliasDeclImpl extends ASTWrapperPsiElement implements Cpp2ObjAliasDecl {

  public Cpp2ObjAliasDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitObjAliasDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public Cpp2Expr getExpr() {
    return findNotNullChildByClass(Cpp2Expr.class);
  }

  @Override
  @NotNull
  public Cpp2Identifier getIdentifier() {
    return findNotNullChildByClass(Cpp2Identifier.class);
  }

  @Override
  @Nullable
  public Cpp2TypeSpecifier getTypeSpecifier() {
    return findChildByClass(Cpp2TypeSpecifier.class);
  }

}
