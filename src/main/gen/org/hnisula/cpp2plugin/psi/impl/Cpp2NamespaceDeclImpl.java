// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.hnisula.cpp2plugin.psi.Cpp2Types.*;
import org.hnisula.cpp2plugin.psi.Cpp2NamespaceDeclMixin;
import org.hnisula.cpp2plugin.psi.*;

public class Cpp2NamespaceDeclImpl extends Cpp2NamespaceDeclMixin implements Cpp2NamespaceDecl {

  public Cpp2NamespaceDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitNamespaceDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2RootStmtBlock getRootStmtBlock() {
    return findChildByClass(Cpp2RootStmtBlock.class);
  }

}
