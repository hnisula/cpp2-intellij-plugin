// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2RootStmtBlock extends PsiElement {

  @NotNull
  List<Cpp2FuncDecl> getFuncDeclList();

  @NotNull
  List<Cpp2NamespaceDecl> getNamespaceDeclList();

  @NotNull
  List<Cpp2TypeDecl> getTypeDeclList();

  @NotNull
  List<Cpp2ValueDecl> getValueDeclList();

  @Nullable
  PsiElement getContext();

}
