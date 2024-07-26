// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class Cpp2Visitor extends PsiElementVisitor {

  public void visitAddExpr(@NotNull Cpp2AddExpr o) {
    visitExpr(o);
  }

  public void visitAndExpr(@NotNull Cpp2AndExpr o) {
    visitExpr(o);
  }

  public void visitArg(@NotNull Cpp2Arg o) {
    visitPsiElement(o);
  }

  public void visitAssign(@NotNull Cpp2Assign o) {
    visitPsiElement(o);
  }

  public void visitBitAndExpr(@NotNull Cpp2BitAndExpr o) {
    visitExpr(o);
  }

  public void visitBitOrExpr(@NotNull Cpp2BitOrExpr o) {
    visitExpr(o);
  }

  public void visitBitXorExpr(@NotNull Cpp2BitXorExpr o) {
    visitExpr(o);
  }

  public void visitDecl(@NotNull Cpp2Decl o) {
    visitPsiElement(o);
  }

  public void visitDivExpr(@NotNull Cpp2DivExpr o) {
    visitExpr(o);
  }

  public void visitEqExpr(@NotNull Cpp2EqExpr o) {
    visitExpr(o);
  }

  public void visitExpr(@NotNull Cpp2Expr o) {
    visitPsiElement(o);
  }

  public void visitForLoop(@NotNull Cpp2ForLoop o) {
    visitPsiElement(o);
  }

  public void visitFuncCall(@NotNull Cpp2FuncCall o) {
    visitExpr(o);
  }

  public void visitFuncDecl(@NotNull Cpp2FuncDecl o) {
    visitPsiElement(o);
  }

  public void visitFuncExpr(@NotNull Cpp2FuncExpr o) {
    visitExpr(o);
  }

  public void visitFuncParams(@NotNull Cpp2FuncParams o) {
    visitPsiElement(o);
  }

  public void visitFuncSignature(@NotNull Cpp2FuncSignature o) {
    visitPsiElement(o);
  }

  public void visitGtExpr(@NotNull Cpp2GtExpr o) {
    visitExpr(o);
  }

  public void visitGteqExpr(@NotNull Cpp2GteqExpr o) {
    visitExpr(o);
  }

  public void visitIdScoped(@NotNull Cpp2IdScoped o) {
    visitExpr(o);
  }

  public void visitLeftShiftExpr(@NotNull Cpp2LeftShiftExpr o) {
    visitExpr(o);
  }

  public void visitLiteral(@NotNull Cpp2Literal o) {
    visitExpr(o);
  }

  public void visitLtExpr(@NotNull Cpp2LtExpr o) {
    visitExpr(o);
  }

  public void visitLteqExpr(@NotNull Cpp2LteqExpr o) {
    visitExpr(o);
  }

  public void visitModExpr(@NotNull Cpp2ModExpr o) {
    visitExpr(o);
  }

  public void visitMulExpr(@NotNull Cpp2MulExpr o) {
    visitExpr(o);
  }

  public void visitNamedDecl(@NotNull Cpp2NamedDecl o) {
    visitPsiElement(o);
  }

  public void visitNeqExpr(@NotNull Cpp2NeqExpr o) {
    visitExpr(o);
  }

  public void visitOrExpr(@NotNull Cpp2OrExpr o) {
    visitExpr(o);
  }

  public void visitParamDecl(@NotNull Cpp2ParamDecl o) {
    visitPsiElement(o);
  }

  public void visitParamKind(@NotNull Cpp2ParamKind o) {
    visitPsiElement(o);
  }

  public void visitReturnExpr(@NotNull Cpp2ReturnExpr o) {
    visitExpr(o);
  }

  public void visitRightShiftExpr(@NotNull Cpp2RightShiftExpr o) {
    visitExpr(o);
  }

  public void visitScope(@NotNull Cpp2Scope o) {
    visitPsiElement(o);
  }

  public void visitStmt(@NotNull Cpp2Stmt o) {
    visitPsiElement(o);
  }

  public void visitStmtBlock(@NotNull Cpp2StmtBlock o) {
    visitPsiElement(o);
  }

  public void visitSubExpr(@NotNull Cpp2SubExpr o) {
    visitExpr(o);
  }

  public void visitSubscriptExpr(@NotNull Cpp2SubscriptExpr o) {
    visitExpr(o);
  }

  public void visitTemplateDecl(@NotNull Cpp2TemplateDecl o) {
    visitPsiElement(o);
  }

  public void visitTemplateDef(@NotNull Cpp2TemplateDef o) {
    visitPsiElement(o);
  }

  public void visitTemplateParamDecl(@NotNull Cpp2TemplateParamDecl o) {
    visitPsiElement(o);
  }

  public void visitTypeId(@NotNull Cpp2TypeId o) {
    visitPsiElement(o);
  }

  public void visitTypeIdScoped(@NotNull Cpp2TypeIdScoped o) {
    visitPsiElement(o);
  }

  public void visitTypeSpecifier(@NotNull Cpp2TypeSpecifier o) {
    visitPsiElement(o);
  }

  public void visitVarDecl(@NotNull Cpp2VarDecl o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
