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

public class Cpp2MemberDeclImpl extends ASTWrapperPsiElement implements Cpp2MemberDecl {

  public Cpp2MemberDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitMemberDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2Decl getDecl() {
    return findChildByClass(Cpp2Decl.class);
  }

  @Override
  @Nullable
  public Cpp2FuncDecl getFuncDecl() {
    return findChildByClass(Cpp2FuncDecl.class);
  }

  @Override
  @Nullable
  public Cpp2MemberAccess getMemberAccess() {
    return findChildByClass(Cpp2MemberAccess.class);
  }

  @Override
  @Nullable
  public Cpp2TypeDecl getTypeDecl() {
    return findChildByClass(Cpp2TypeDecl.class);
  }

}
