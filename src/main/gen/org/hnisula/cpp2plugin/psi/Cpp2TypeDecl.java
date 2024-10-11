// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.hnisula.cpp2plugin.Cpp2NamedDeclaration;
import org.hnisula.cpp2plugin.Cpp2Scope;

public interface Cpp2TypeDecl extends Cpp2NamedDeclaration, Cpp2Scope {

  @NotNull
  List<Cpp2MemberDecl> getMemberDeclList();

  @Nullable
  Cpp2TemplateDecl getTemplateDecl();

}
